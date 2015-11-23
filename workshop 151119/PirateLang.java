class PirateLang 
{

	public String toPirateLang(String seq) {
		String[] chars = {"B", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V"};
		String result = "";
		boolean ok = false;
        for (int j = 0; j < seq.length(); j++) {
            ok = false;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i].equalsIgnoreCase(String.valueOf(seq.charAt(j)))) {
                    result += String.valueOf(seq.charAt(j)).toUpperCase() + "o" + String.valueOf(seq.charAt(j)).toUpperCase();
                    ok = true;
                }
            }
            if(!ok)
                result += String.valueOf(seq.charAt(j)).toUpperCase();
        }

        return result;
	}


}