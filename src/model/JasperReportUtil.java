
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;
import fr.opensagres.xdocreport.template.formatter.FieldsMetadata;

public class JasperReportUtil {

	public static void main(String[] args) throws Exception {
		List<Person> persons = PersonData.getPeople();
		try {
			InputStream in = new FileInputStream("abc.docx");
			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Velocity);

			IContext context = report.createContext();
			FieldsMetadata metadata = new FieldsMetadata();
			metadata.addFieldAsList("persons.name");
			metadata.addFieldAsList("persons.foods");
			metadata.addFieldAsList("persons.foods.name");
			metadata.setAfterTableCellToken("|");
			report.setFieldsMetadata(metadata);
			context.put("persons", persons);
			context.put("persons", persons);
			System.out.println("===44=======");
			OutputStream out = new FileOutputStream(new File("aaaaaaaaaaaaaaa.docx"));
			report.process(context, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("======ERROR=====");
		}

	}

}
