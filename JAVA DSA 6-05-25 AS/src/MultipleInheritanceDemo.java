//Multiple interface
interface Browser1 {
    void Browser1();
}

interface Browser2 {
    void Browser2();
}

interface Browser3 {
    void Browser3();
}

class Browser implements Browser1, Browser2, Browser3 {
    public void Browser1() {
        System.out.println(" Google Chrome");
    }

    public void Browser2() {
        System.out.println(" Morzilla Firefox");
    }

    public void Browser3() {
        System.out.println(" Internet Explore");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.Browser1();
        browser.Browser2();
        browser.Browser3();
    }
}
