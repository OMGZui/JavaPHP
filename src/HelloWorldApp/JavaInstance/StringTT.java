package HelloWorldApp.JavaInstance;

public class StringTT {
    public String str;
    public String str1;
    public String str2;
    public String str3;

    public StringTT() {
        this.str = "www-google-com";
        this.str1 = "Hello World!";
        this.str2 = "hello World!";
        this.str3 = "Hello World!";
    }

    public class StringTTT {

        public void Compare() {
            System.out.println(str1.compareTo(str2));
            System.out.println(str1.compareToIgnoreCase(str2));
            System.out.println(str1.compareTo(str3));
        }

        public void Split() {
            String[] s = str.split("-");
            for (String i : s) {
                System.out.printf("%s   ", i);
            }
        }
    }

    public static void main(String[] args) {
        StringTT tt = new StringTT();
        StringTTT ttt = tt.new StringTTT();

        System.out.println("字符串比较：");
        ttt.Compare();

        System.out.println("字符串剔除：");
        System.out.println(tt.str1.substring(6));

        System.out.println("字符串替换：");
        System.out.println(tt.str1.replace("H", "W"));

        System.out.println("字符串翻转：");
        System.out.println(new StringBuffer(tt.str1).reverse().toString());

        System.out.println("字符串分割：");
        ttt.Split();

    }
}
