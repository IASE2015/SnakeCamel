package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		//if(!snake_case.contains("_")) throw new IllegalArgumentException("Type snake_case String");
		String[] words = snake_case.split("_");
		//for(int i=0;i<words.length;i++)System.out.println(words[i]);
		StringBuilder sb = new StringBuilder();
			for (int i = 0; i < words.length; i++) {
				while(words[i].length()==0)
					if(words[i].length()==0) i++;
				 sb.append(capitalize(words[i]));
			}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		int k = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				k++;
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(uncapitalize(String.valueOf(c)));
				j = i+1;
			}
		}
		if(k==0) throw new IllegalArgumentException("Type camelcase String");
		sb.append(camelcase.substring(j));
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first=s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
