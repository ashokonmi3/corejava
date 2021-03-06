package corejavapackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		try {
//			FileInputStream fin = new FileInputStream(
//					"C:\\\\Users\\\\assharma\\\\eclipse-workspace\\\\CoreJava\\\\src\\\\corejavapackage\\\\a.txt");
//			int i = fin.read();
//			System.out.print((char) i);
//			fin.close();
//			System.out.println("success...");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ====================
// Reading all characters
//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		try {
//			FileInputStream fin = new FileInputStream(
//					"C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\a.txt");
//			int i = 0;
//			while ((i = fin.read()) != -1) {
//				System.out.print((char) i);
//			}
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ========================
// Java BufferedOutputStream class is used for buffering an output stream.
// It internally uses buffer to store data. It adds more efficiency than to
// write
// data directly into a stream. So, it makes the performance fast.
// **********
//public class O00020_Filehandling {
//	public static void main(String args[]) throws Exception {
//		FileOutputStream fout = new FileOutputStream(
//				"C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\a.txt");
//		BufferedOutputStream bout = new BufferedOutputStream(fout);
//		String s = "Welcome to javaworld.";
//		byte b[] = s.getBytes();
//		bout.write(b);
//		bout.flush();
//		bout.close();
//		fout.close();
//		System.out.println("success");
//	}
//}
// =============================
//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		try {
//			FileInputStream fin = new FileInputStream(
//					"C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\a.txt");
//			BufferedInputStream bin = new BufferedInputStream(fin);
//			int i;
//			while ((i = bin.read()) != -1) {
//				System.out.print((char) i);
//			}
//			bin.close();
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ========================

/*
 * Property files
 * 
 */
//public class O00020_Filehandling {
//	public static void main(String[] args) throws IOException {
//		// create file input stream object for the properties file
//		FileInputStream fis = new FileInputStream(
//				"C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\config.properties");
//		// create Properties class object to access properties file
//		Properties prop = new Properties();
//		// load the properties file
//		prop.load(fis);
//		// get the property of "url" using getProperty()
//		System.out.println(prop.getProperty("url"));
//		System.out.println(prop.getProperty("author"));
//		// get the property of "url" using get()
//		System.out.println(prop.get("user"));
//	}
//}

// ====================================

/*
 * excel file
 * 
 */
public class O00020_Filehandling {
	public static void main(String[] args) throws Exception {
		// create file input stream object for the excel sheet
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFCell cell;
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\test.xlsx");
		// create object for work book
		workbook = new XSSFWorkbook(fis);
		// create object for sheet present in excel using Workbook object 'wb'
		sheet = workbook.getSheetAt(0);
		// create object for row present in sheet using Sheet object 'sheet'
		Row row = sheet.getRow(0);
		// create object for cell present in row using Row object 'row'
		cell = sheet.getCell(0);
		// print the value present in the excel sheet
		System.out.println(cell.getStringCellValue());
	}
}
// ====================================

// public class O00020_Filehandling {
// public static void main(String[] args) throws Exception {
// create file input stream object for the excel sheet
// FileInputStream fis = new FileInputStream(
// "C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\test.xlsx");
// // create object for work book
// Workbook wb = WorkbookFactory.create(fis);
// // create object for sheet present in excel using Workbook object 'wb'
// Sheet sheet = wb.getSheet("Sheet1");
// // create object for row present in sheet using Sheet object 'sheet'
// Row row = sheet.getRow(0);
// // create object for cell present in row using Row object 'row'
// Cell cell = row.createCell(0);
// cell.setCellValue("Written by apache poi");
// FileOutputStream fos = new FileOutputStream(
// "C:\\Users\\assharma\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\test.xlsx");
// wb.write(fos);
// System.out.println("success");
//

// FileInputStream fis = new FileInputStream(
// "C:\\\\Users\\\\assharma\\\\eclipse-workspace\\\\CoreJava\\\\src\\\\corejavapackage\\\\test.xlsx");
// // create object for work book
// Workbook wb = WorkbookFactory.create(fis);
// // create object for sheet present in excel using Workbook object 'wb'
// Sheet sheet = wb.getSheet("Sheet1");
// // create object for row present in sheet using Sheet object 'sheet'
// Row row = sheet.getRow(0);
// // create object for cell present in row using Row object 'row'
// Cell cell = row.getCell(0);
// // print the value present in the excel sheet
// System.out.println(cell.getStringCellValue());
//
// }
// }

// ================================
// class O00020_Filehandling {
// public static void main(String[] args) {
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// stream.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
// //
// }
// }

// ===============================
// class O00020_Filehandling {
//
// public static void main(String[] args) {
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
//
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// stream.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
//
// }
// }
// ========================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
//
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
// List<String> list = new ArrayList<>();
//
// // reading csv file into stream, try-with-resources
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// // 1 filtered flight numbers BA-731 and VA-421
// // 2. then only map filtered result to there airport names only
// // 3. store result into a List
// list = stream.filter(line -> line.contains("814-555-5179")).map(line -> {
// String[] str = line.split(",");
// return str[2];
// }).collect(Collectors.toList());
//
// // 4. print result list
// list.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
//
// }
//
// }

// =================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
// PDDocument pd;
// BufferedWriter wr;
// try {
// File input = new File("C://My//P//Study//CoreJava//Sample_CV.pdf"); // The
// PDF file from where you would
// // like to extract
// File output = new File("C://My//P//Study//CoreJava//SampleText.txt"); // The
// text file where you are going
// // to store the extracted
// // data
// pd = PDDocument.load(input);
// System.out.println(pd.getNumberOfPages());
// System.out.println(pd.isEncrypted());
// pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
// PDFTextStripper stripper = new PDFTextStripper();
// wr = new BufferedWriter(new OutputStreamWriter(new
// FileOutputStream(output)));
// stripper.writeText(pd, wr);
// if (pd != null) {
// pd.close();
// }
// // I use close() to flush the stream.
// wr.close();
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }