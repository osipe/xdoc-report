package util;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class XDocReportUtil {

	public static void main(String[] args) throws Exception {
		report();
	}

	public static void report() {
		try {
			File file = new File("C://Users//QuangNT13//Desktop//TEST.docx");
			String fileName = "HuongDan_21101000076.docx";
			if (fileName.lastIndexOf(".") > 0) {
				System.err.println(fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()));
			}
			System.out.println(
					org.apache.commons.codec.binary.Base64.encodeBase64String(FileUtils.readFileToByteArray(file)));
		} catch (Exception e1) {
		}
		/*
		 * try{ InputStream in = new FileInputStream("abc.docx"); IXDocReport
		 * report = XDocReportRegistry.getRegistry().loadReport(in,
		 * TemplateEngineKind.Velocity);
		 * 
		 * IContext context = report.createContext(); context.put("aaa",
		 * "111213231"); System.out.println("==========="); OutputStream out =
		 * new FileOutputStream(new File("123.docx")); report.process(context,
		 * out); }catch(Exception e){ System.out.println("======ERROR====="); }
		 */
	}
}
