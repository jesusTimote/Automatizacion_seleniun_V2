package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//a[normalize-space()='Selenium y Cucumber con Java' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);
    }

}