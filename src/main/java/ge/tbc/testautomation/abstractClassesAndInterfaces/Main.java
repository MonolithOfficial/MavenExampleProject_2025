package ge.tbc.testautomation.abstractClassesAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10, 10);
        IRecolorable interfaceRecolorable = new Rectangle(10, 10);
        interfaceRecolorable.recolor();
    }

    private static void recolor(IRecolorable recolorableFigure){
        recolorableFigure.recolor();
    }
}
