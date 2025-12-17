public class InvalidDataProviderReturnType {
  @DataProvider(name = "Languages")
  List<String> getData() {
    return List.of("Java", "Kotlin");
  }

  @DataProvider(name = "Languages")
  String[][] getGoodData() {
    String[][] data = {
      {"Java"},
      {"Kotlin"}
    };
    return data;
  }

  @Test(dataProvider = "Languages")
  public void testData(String language) {
    System.out.println(language);
  }
}