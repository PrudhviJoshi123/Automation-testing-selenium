package utils;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import hooks.Base_asianpaints;
import page_Xpaths.Elements;

public class PaintsandTextures extends Base_asianpaints {
	Elements e=new Elements();
	
	public void url() {
		driver.get(prop.getProperty("url"));
		}
	
	public void paintstextures()
	{
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(e.pt)).perform();
	}
	
	public void pandt_click() {
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		driver.findElement(e.pt).click();
	}
		
	public void totalpaintsandtextures(String name, String email, String mobnum, String pincode) throws InterruptedException, IOException 
	{
		
		scrollfun(950);
		Thread.sleep(1000);
		driver.findElement(e.namevalue).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(e.emailvalue).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(e.mobilevalue).sendKeys(mobnum);
		Thread.sleep(1000);
		driver.findElement(e.pincodevalue).sendKeys(pincode);
		Thread.sleep(1000);
		driver.findElement(e.enqnow).click();
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet1");	//get existing Sheet1
		try {List<WebElement> list=driver.findElements(e.error);
		Row row=ws.createRow(0);  				//create a row in the sheet
			for(int i=0;i<list.size();i++){
				row.createCell(i).setCellValue(list.get(i).getText()); //create a cell in the row and write data
			}
			FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
			wb.write(fout);			//write entire workbook data into file and save

			fin.close();	//close the objects
			fout.close();
			}catch (Exception e) {}
			//System.out.println(list.get(i).getText());}}
		Row row=ws.createRow(1);	
		try {String str= driver.findElement(e.success).getText();
			String str1=driver.findElement(e.success_dis).getText();
			row.createCell(0).setCellValue(str  + "  " +  str1);
		//System.out.println(str  + "  " +  str1);
			FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
			wb.write(fout);			//write entire workbook data into file and save

			fin.close();	//close the objects
			fout.close();
		}catch (Exception e) {}
	}
	
	public void colours2200() throws IOException
	{
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		driver.findElement(e.colours2200).click();
		scrollfun(400);
		driver.findElement(e.colourcombination1).click();
		try{driver.findElement(e.warm).click();}catch(Exception e) {}
		try{driver.findElement(e.light).click();}catch(Exception e) {}
		try{driver.findElement(e.Bedroom).click();}catch(Exception e) {}
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		List<WebElement> list=driver.findElements(e.colours2200list);
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet2");	//get existing Sheet1
		
						for(int i=0;i<list.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
		FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
		wb.write(fout);			//write entire workbook data into file and save
		fin.close();	//close the objects
		fout.close();
	}
		
	public void scrollfun(int value) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," +value+ ")", "");
	}
		
	public void interior_textures() throws IOException 
	{
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		driver.findElement(e.Interior_Textures).click();
		try {Thread.sleep(2000);} catch (InterruptedException e1) {e1.printStackTrace();}
		driver.findElement(e.colourcombination2).click();
		driver.findElement(e.filterby).click();
		try {driver.findElement(e.filter1).click();}catch(Exception e) {}
		try {driver.findElement(e.filter2).click();}catch(Exception e) {}
		try {driver.findElement(e.filter3).click();}catch(Exception e) {}
		driver.findElement(e.applybutton).click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		List<WebElement> list1=driver.findElements(e.result_list);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet3");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
		FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
		wb.write(fout);			//write entire workbook data into file and save
		fin.close();	//close the objects				
		fout.close();
	}

	public void metalpaint() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.Metalpaint).click();
		Thread.sleep(1000);
		scrollfun(300);
		Thread.sleep(1000);
		driver.findElement(e.filterby).click();
		Thread.sleep(1000);
		try{driver.findElement(e.filter9).click();}catch (Exception e) {}
		Thread.sleep(1000);
		driver.findElement(e.applybutton).click();
		scrollfun(500);
		List<WebElement> list1=driver.findElements(e.products);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet3");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
		FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
		wb.write(fout);			//write entire workbook data into file and save
		fin.close();	//close the objects				
		fout.close();
	}

	public void woodpaint() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.Woodpaint).click();
		Thread.sleep(1000);
		scrollfun(700);
		Thread.sleep(1000);
		driver.findElement(e.paint_type).click();
		Thread.sleep(1000);
		driver.findElement(e.filterby).click();
		Thread.sleep(1000);
		try{driver.findElement(e.filter9).click();}catch (Exception e) {}
		Thread.sleep(1000);
		driver.findElement(e.applybutton).click();
		scrollfun(500);
		List<WebElement> list1=driver.findElements(e.products);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet4");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
		FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
		wb.write(fout);			//write entire workbook data into file and save
		fin.close();	//close the objects				
		fout.close();
		}

	public void view_all() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.ViewAll).click();
		Thread.sleep(1000);
		scrollfun(1000);
		Thread.sleep(1000);
		List<WebElement> list1=driver.findElements(e.paintname);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet5");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void interiors_wp() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.Interior_wp).click();
		Thread.sleep(1000);
		scrollfun(500);
		Thread.sleep(1000);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		try{driver.findElement(e.filter9).click();}catch (Exception e) {}
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.paintname);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet6");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
		Thread.sleep(5000);
		driver.findElement(e.comparepro3).click();
		Thread.sleep(1000);
		scrollfun(200);
		driver.findElement(e.comparepro4).click();
		Thread.sleep(1000);
		driver.findElement(e.compareboth).click();
		Thread.sleep(2000);
		takescreenshot("compare_Interior_waterproof");
	}

	public void bathroom_wp() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.Bathroom).click();
		scrollfun(500);
		Thread.sleep(1000);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		try{driver.findElement(e.filter9).click();}catch (Exception e) {}
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.paintname);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet7");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
		Thread.sleep(5000);
		driver.findElement(e.comparepro3).click();
		Thread.sleep(1000);
		scrollfun(200);
		driver.findElement(e.comparepro4).click();
		Thread.sleep(1000);
		driver.findElement(e.compareboth).click();
		Thread.sleep(2000);
		takescreenshot("compare_Bathroom_products");
	}

	public void terraceandtank() throws InterruptedException, IOException 
	{
		Thread.sleep(1000);
		driver.findElement(e.Terrrace_Tank).click();
		scrollfun(500);
		Thread.sleep(1000);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		driver.findElement(e.filter1).click();
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.paintname);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet8");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
		Thread.sleep(5000);
		driver.findElement(e.comparepro3).click();
		Thread.sleep(1000);
		scrollfun(200);
		driver.findElement(e.comparepro4).click();
		Thread.sleep(1000);
		driver.findElement(e.compareboth).click();
		Thread.sleep(2000);
		takescreenshot("compare_TerraceandTank");
	}

	public void tileguard() throws InterruptedException, IOException 
	{
		driver.findElement(e.tile).click();
		Thread.sleep(2000);
		scrollfun(1000);
		List<WebElement> listA=driver.findElements(e.tile_prop_name);
		List<WebElement> listB=driver.findElements(e.tile_prop_dis);
		List<WebElement> list=driver.findElements(e.tile_name);
		List<WebElement> list1=driver.findElements(e.tile_dis);
//		for(int i=0;i<listB.size();i++) {
//			System.out.println(listA.get(i).getText());
//			System.out.println(listB.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet9");	//get existing Sheet1
		
						for(int i=0;i<listB.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(listA.get(i).getText());
					row.createCell(i+1).setCellValue(listB.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
		for(int j=0;j<list.size();j++) {
			Row row=ws.createRow(j+2);
		
//			System.out.println(list.get(j).getText()+"==>"+list1.get(j).getText());}
						row.createCell(j).setCellValue(list.get(j).getText()+"==>"+list1.get(j).getText());}
		FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
		wb.write(fout);			//write entire workbook data into file and save
		fin.close();	//close the objects				
		fout.close();
	}

	public void texture_finishes() throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		driver.findElement(e.Textu_finishes).click();
		Thread.sleep(1000);
		driver.findElement(e.paint_type).click();
		Thread.sleep(1000);
		scrollfun(700);
		Thread.sleep(1000);
		driver.findElement(e.filterbutton).click();
		Thread.sleep(1000);
		try{driver.findElement(e.filterA).click();}catch (Exception e) {}
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.result_listA);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet10");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void wall_paints_exterior() throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		driver.findElement(e.wall_paints_ext).click();
		Thread.sleep(2000);
		driver.findElement(e.paint_type).click();
		scrollfun(700);
		Thread.sleep(2000);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		driver.findElement(e.filterA).click();
		Thread.sleep(2000);
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.result_listA);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet11");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void stencils_interior() throws InterruptedException, IOException 
	{
		driver.findElement(e.stensils).click();
		scrollfun(200);
		try {driver.findElement(e.understand).click();}catch (Exception e) {}
		try{driver.findElement(e.colourcombination2).click();}catch (Exception e) {}
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		try{driver.findElement(e.filter1).click();}catch (Exception e) {	}
		try{driver.findElement(e.filter8).click();}catch (Exception e) {	}
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.result_list);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet12");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void kids_interior() throws InterruptedException, IOException 
	{
		driver.findElement(e.kids).click();
		Thread.sleep(2000);
		scrollfun(400);
		driver.findElement(e.theme).click();
		scrollfun(750);
		driver.findElement(e.toggle).click();
		driver.findElement(e.toggle1).click();
		List<WebElement> list1=driver.findElements(e.kid_themes);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet13");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void wall_textures_interior() throws InterruptedException, IOException 
	{	
		driver.findElement(e.wall_textures_int).click();
		Thread.sleep(2000);
		scrollfun(250);
		Thread.sleep(2000);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		driver.findElement(e.filter8).click();
		Thread.sleep(2000);
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.Textures_heading);
		List<WebElement> list2=driver.findElements(e.Texture_discription);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());
//			System.out.println(list2.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet14");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					row.createCell(i+1).setCellValue(list2.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void wall_paints_interior() throws InterruptedException, IOException
	{
		driver.findElement(e.wall_paints_int).click();
		Thread.sleep(2000);
		driver.findElement(e.paint_type).click();
		Thread.sleep(2000);
		scrollfun(500);
		driver.findElement(e.filterby).click();
		Thread.sleep(2000);
		driver.findElement(e.filter7).click();
		Thread.sleep(2000);
		driver.findElement(e.applybutton).click();
		List<WebElement> list1=driver.findElements(e.paintname);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet15");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
		Thread.sleep(5000);
		driver.findElement(e.comparepro1).click();
		Thread.sleep(1000);
		scrollfun(200);
		driver.findElement(e.comparepro2).click();
		Thread.sleep(1000);
		driver.findElement(e.compare).click();
		Thread.sleep(2000);
		takescreenshot("compare_interior_wall_paint");
	}

	public void paint_selector() throws IOException 
	{
			driver.findElement(e.paintselect).click();
			scrollfun(500);
			driver.findElement(e.filterby).click();
			try{driver.findElement(e.filter4).click();}catch (Exception e) {}
			driver.findElement(e.applybutton).click();
			try {Thread.sleep(1000);} catch (Exception e) {}
			try{driver.findElement(e.understand).click();}catch(Exception e) {}
			List<WebElement> list1=driver.findElements(e.paintname);
//			for(int i=0;i<list1.size();i++) {
//				System.out.println(list1.get(i).getText());}
			FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
			XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
			XSSFSheet ws=wb.getSheet("Sheet16");	//get existing Sheet1
			
							for(int i=0;i<list1.size();i++) {
								Row row=ws.createRow(i+1);
						row.createCell(i).setCellValue(list1.get(i).getText());
						//System.out.println(list.get(i).getText());
						}
							FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
							wb.write(fout);			//write entire workbook data into file and save
							fin.close();	//close the objects				
							fout.close();
	}

	public void paint_budget_calculator(String value) throws IOException 
	{
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		driver.findElement(e.paint_bud_calc).click();
		try {Thread.sleep(2000);} catch (Exception e1) {}
		driver.findElement(e.repaint).click();
		driver.findElement(e.exte).click();
		try{driver.findElement(e.sizeofhome).click();}catch(Exception e) {}
		driver.findElement(e.sqfeet).sendKeys(value);
		driver.findElement(e.calculatenow).click();
		List<WebElement> list=driver.findElements(e.budget_product);
//		for(int i=0;i<=2;i++) {
//		System.out.println(list.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet17");	//get existing Sheet1
		
						for(int i=0;i<list.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}

	public void exterior_textures() throws InterruptedException, IOException 
	{
		try{driver.findElement(e.understand).click();}catch(Exception e) {}
		driver.findElement(e.Exterior_Textures).click();
		Thread.sleep(2000);
		driver.findElement(e.colourcombination2).click();
		driver.findElement(e.filterby).click();
		try {driver.findElement(e.filter1).click();}catch(Exception e) {}		
		driver.findElement(e.applybutton).click();
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		List<WebElement> list1=driver.findElements(e.result_list);
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i).getText());}
		FileInputStream fin=new FileInputStream("F:\\ap\\asianpaints.xlsx");  //get the file
		XSSFWorkbook wb=new XSSFWorkbook(fin);   //get workbook in the file
		XSSFSheet ws=wb.getSheet("Sheet18");	//get existing Sheet1
		
						for(int i=0;i<list1.size();i++) {
							Row row=ws.createRow(i+1);
					row.createCell(i).setCellValue(list1.get(i).getText());
					//System.out.println(list.get(i).getText());
					}
						FileOutputStream fout=new FileOutputStream("F:\\ap\\asianpaints.xlsx"); //file to write data
						wb.write(fout);			//write entire workbook data into file and save
						fin.close();	//close the objects				
						fout.close();
	}
	
	public void close(){driver.close();}
	
	public void validateTitle(String str) throws InterruptedException {
		
		Thread.sleep(2000);
		if(driver.getTitle().contains(str)) {
			assertEquals(driver.getTitle(),str);
		}
		else {
			assertEquals(driver.getTitle(),str);
		}
		
	}

}
