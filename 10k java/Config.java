public class Config{
	static String configName="System config";
	String settingValue;
		public static void main(String[]args){
			Config s1=new Config();
			s1.settingValue="Dark Mode";
			Config s2=new Config();
			s2.settingValue="Light Mode";
			System.out.println("Config Name:"+Config.configName);
			System.out.println("Setting 1 :"+s1.settingValue );
			System.out.println("Setting 2 :"+s2.settingValue);
}
}