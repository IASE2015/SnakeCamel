package snakecamel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(SnakeCamelUtil.capitalize(" "));
		System.out.println(SnakeCamelUtil.capitalize("a"));
		System.out.println(SnakeCamelUtil.capitalize("xyz"));
		
		System.out.println(SnakeCamelUtil.uncapitalize(" "));
		System.out.println(SnakeCamelUtil.uncapitalize("A"));
		System.out.println(SnakeCamelUtil.uncapitalize("Xyz"));
		
		System.out.println(SnakeCamelUtil.snakeToCamelcase("abc"));
		System.out.println(SnakeCamelUtil.snakeToCamelcase("abc_def"));*/
		System.out.println(SnakeCamelUtil.snakeToCamelcase("abc_def_gh"));
		System.out.println(SnakeCamelUtil.snakeToCamelcase("abc__def___gh"));
		System.out.println(SnakeCamelUtil.snakeToCamelcase("_abc_def__"));

		System.out.println(SnakeCamelUtil.camelToSnakecase("Abc"));
		System.out.println(SnakeCamelUtil.camelToSnakecase("AbcDef"));
		System.out.println(SnakeCamelUtil.camelToSnakecase("AbcDefGh"));
	}

}
