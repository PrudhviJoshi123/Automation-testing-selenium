package paintsandtextures_testsuite;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.PaintsandTextures;

public class PaintsandTextures_stepDef{
	
	PaintsandTextures c=new PaintsandTextures();

	 @Given("^User should be in asianpaints website$")
	    public void user_should_be_in_asianpaints_website() throws Throwable {
		
		 c.url();
	}

	@When("^User click on Paints & Textures$")
	public void user_click_on_paints_textures() throws Throwable {
		
		c.pandt_click();
	}

	@Then("^User should see categories of Paints & Textures and check title$")
	public void user_should_see_categories_of_paints_textures_and_check_title() throws Throwable  {
		
		c.validateTitle("paints_and_textures");
	}

	
	
	@When("^User enters invalid combinations of (.+), (.+), (.+) and (.+) and click on Enquiry now button$")
	public void user_enters_invalid_combinations_of_and_and_click_on_enquiry_now_button(String name, String email, String mobilenumber, String pincode) throws Throwable {
	        
		c.totalpaintsandtextures(name, email, mobilenumber, pincode);
	}

	@Then("^User should see invalid data message$")
	public void user_should_see_invalid_data_message() throws Throwable {

		c.close();
	}

	
	@When("^User place the mouse on Paints & Textures and click on 2200colours under Colours & Textures$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_2200colours_under_colours_textures() throws Throwable  {

		c.paintstextures();
		c.colours2200();
		
	}

	@When("^Select the required colour combinations and apply the filters to filter the required colours shades$")
	public void select_the_required_colour_combinations_and_apply_the_filters_to_filter_the_required_colours_shades() throws Throwable {


	}

	@Then("^User should see different shades of colours that are in 2200colours$")
	public void user_should_see_different_shades_of_colours_that_are_in_2200colours() throws Throwable  {

		c.validateTitle("colors");
		c.close();
	}
	
	

	@When("^User place the mouse on Paints & Textures and click on Interior Textures under Colours & Textures$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_interior_textures_under_colours_textures() throws Throwable  {

		c.paintstextures();
		c.interior_textures();
		
	}

	@Then("^User should see different shades of colours that are in Interior Textures$")
	public void user_should_see_different_shades_of_colours_that_are_in_interior_textures() throws Throwable  {

		c.validateTitle("interior");
		c.close();
		
	}

	@When("^User place the mouse on Paints & Textures and click on Exterior Textures under Colours & Textures$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_exterior_textures_under_colours_textures() throws Throwable  {

		c.paintstextures();
		c.exterior_textures();
		
	}

	@Then("^User should see different shades of colours that are in Exterior Textures$")
	public void user_should_see_different_shades_of_colours_that_are_in_exterior_textures() throws Throwable  {

		c.validateTitle("exterior");
		c.close();
		
	}
	
    @When("^User place the mouse on Paints & Textures and click on Paint Budget Calculator under Colours & Textures$")
    public void user_place_the_mouse_on_paints_textures_and_click_on_paint_budget_calculator_under_colours_textures() throws Throwable {
        
    	c.paintstextures();
		
    }
    
    
    @And("^Select Type of Poject, select space, size of home and (.+)$")
    public void select_type_of_poject_select_space_size_of_home_and(String carpetarea) throws Throwable {
        
    	c.paint_budget_calculator(carpetarea);
    }


    @Then("^User should click on calculate now to see the Recommended Product with details$")
    public void user_should_click_on_calculate_now_to_see_the_recommended_product_with_details() throws Throwable {
        
    	c.validateTitle("budget");
    	c.close();
    }
	
	
	@When("^User place the mouse on Paints & Textures and click on Paint Selector under Colours & Textures$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_paint_selector_under_colours_textures() throws Throwable  {

		c.paintstextures();
		c.paint_selector();
		
	}

	@When("^Select the required option to filter the required products$")
	public void select_the_required_option_to_filter_the_required_products() throws Throwable {


		
	}

	@Then("^User should see different paint products$")
	public void user_should_see_different_paint_products() throws Throwable  {

		c.validateTitle("selector");
		c.close();
		
	}
	
	
	@When("^User place the mouse on Paints & Textures and click on Wall Paints under Interior$")
	public void user_place_the_mouse_on_paints_Stextures_and_click_on_wall_paints_under_interior() throws Throwable {

		c.paintstextures();
		c.wall_paints_interior();
		
	}
	@When("^Select the required colour type and apply the filters to filter the required wall paints$")
	public void select_the_required_colour_type_and_apply_the_filters_to_filter_the_required_wall_paints() throws Throwable {


		
	}

	@Then("^User should see different types of Wall paints that are in Interior$")
	public void user_should_see_different_types_of_wall_paints_that_are_in_interior() throws Throwable  {

		c.validateTitle("wall paints");
		c.close();
		
	}

	@When("^User place the mouse on Paints & Textures and click on Wall Textures under Interior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_wall_textures_under_interior() throws Throwable  {

		c.paintstextures();
		c.wall_textures_interior();
		
	}

	@When("^Select the filters to filter the required wall Textures$")
	public void select_the_filters_to_filter_the_required_wall_textures() {

		
		
	}

	@Then("^User should see different types of Wall Textures that are in Interior$")
	public void user_should_see_different_types_of_wall_textures_that_are_in_interior()throws Throwable  {

		c.validateTitle("textures");
		c.close();
		
	}

	
	@When("^User place the mouse on Paints & Textures and click on Kid's World under Interior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_kid_s_world_under_interior() throws Throwable  {

		c.paintstextures();
		c.kids_interior();
		
	}

	@When("^Select the required Theme type and apply the toggle switch for each theme to view the themes in dark and light modes$")
	public void select_the_required_theme_type_and_apply_the_toggle_switch_for_each_theme_to_view_the_themes_in_dark_and_light_modes() throws Throwable {

		
		
	}

	@Then("^User should see different types of themes that are in Kid's World$")
	public void user_should_see_different_types_of_themes_that_are_in_kid_s_world() throws Throwable  {

		c.validateTitle("themes");
		c.close();
		
	}

		
	@When("^User place the mouse on Paints & Textures and click on Stencils under Interior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_stencils_under_interior() throws Throwable  {

		c.paintstextures();
		c.stencils_interior();
		
	}

	@When("^Select the required model and filter the required products$")
	public void select_the_required_model_and_filter_the_required_products() throws Throwable {


		
	}

	@Then("^User should see different Stencils designs$")
	public void user_should_see_different_stencils_designs() throws Throwable  {

		c.validateTitle("stencils");
		c.close();
		
	}

	@When("^User place the mouse on Paints & Textures and click on Wall Paints under Exterior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_wall_paints_under_exterior() throws Throwable  {

		c.paintstextures();
		c.wall_paints_exterior();
		
	}

	@Then("^User should see different types of Wall paints that are in Exterior$")
	public void user_should_see_different_types_of_wall_paints_that_are_in_exterior() throws Throwable  {

		c.validateTitle("exterior");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on Textured Finishes under Exterior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_textured_finishes_under_exterior() throws Throwable  {

		c.paintstextures();
		c.texture_finishes();
		
	}

	@When("^Select the required type and apply the filters to filter the required Textured Finishes$")
	public void select_the_required_type_and_apply_the_filters_to_filter_the_required_textured_finishes()throws Throwable  {

		
		
	}

	@Then("^User should see different types of Textured Finishes that are in Exteriors$")
	public void user_should_see_different_types_of_textured_finishes_that_are_in_exteriors() throws InterruptedException {

		c.validateTitle("finishes");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on Tile Guard under Exterior$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_tile_guard_under_exterior() throws Throwable  {
	   
		c.paintstextures();
		c.tileguard();
		
	}

	@Then("^User should see different uses and pre-painting steps of Tile Gaurd that are in Exteriors$")
	public void user_should_see_different_uses_and_pre_painting_steps_of_tile_gaurd_that_are_in_exteriors() throws Throwable {


		c.validateTitle("tile");
		c.close();
	}
	
	@When("^User place the mouse on Paints & Textures and click on Terrace & Tank under Waterproofing$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_terrace_tank_under_waterproofing() throws Throwable  {

		c.paintstextures();
		c.terraceandtank();
	}

	@When("^Select the filter and add required filters for products$")
	public void select_the_filter_and_add_required_filters_for_products() throws Throwable {


		
	}

	@Then("^User should see different Terrace & Tank products$")
	public void user_should_see_different_terrace_tank_products()throws Throwable  {

		c.validateTitle("Terrace & Tank");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on Bathroom under Waterproofing$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_bathroom_under_waterproofing() throws Throwable  {

		c.paintstextures();
		c.bathroom_wp();
		
	}

	@Then("^User should see different Bathroom products$")
	public void user_should_see_different_bathroom_products() throws Throwable  {

		c.validateTitle("Bathroom");
		c.close();
		
	}

	@When("^User place the mouse on Paints & Textures and click on Interiors under Waterproofing$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_interiors_under_waterproofing() throws Throwable  {

		c.paintstextures();
		c.interiors_wp();
		
	}

	@Then("^User should see different Interiors products$")
	public void user_should_see_different_interiors_products() throws Throwable {

		c.validateTitle("interiors");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on View all under Waterproofing$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_view_all_under_waterproofing() throws Throwable {

		c.paintstextures();
		c.view_all();
		
	}

	@Then("^User should see all waterproofing products$")
	public void user_should_see_all_waterproofing_products() throws Throwable  {

		c.validateTitle("waterproofing");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on Wood Paints under Wood & Metal$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_wood_paints_under_wood_metal() throws Throwable {

		c.paintstextures();
		c.woodpaint();
		
	}

	@When("^Select the required design type and apply the filters to filter the required Wood Paints$")
	public void select_the_required_design_type_and_apply_the_filters_to_filter_the_required_wood_paints()throws Throwable  {


		
	}

	@Then("^User should see different types of Wood Paints that are in Wood & Metal$")
	public void user_should_see_different_types_of_wood_paints_that_are_in_wood_metal()throws Throwable  {

		c.validateTitle("wood");
		c.close();
		
	}
	
	@When("^User place the mouse on Paints & Textures and click on Metal Paints under Wood & Metal$")
	public void user_place_the_mouse_on_paints_textures_and_click_on_metal_paints_under_wood_metal()throws Throwable {

		c.paintstextures();
		c.metalpaint();
		
	}

	@When("^Select the required design type and apply the filters to filter the required Metal Paints$")
	public void select_the_required_design_type_and_apply_the_filters_to_filter_the_required_metal_paints()throws Throwable  {


		
	}

	@Then("^User should see different types of Metal Paints that are in Wood & Metal$")
	public void user_should_see_different_types_of_metal_paints_that_are_in_wood_metal()throws Throwable {

		c.validateTitle("metal");
		c.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
