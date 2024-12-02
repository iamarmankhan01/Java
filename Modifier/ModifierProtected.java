public class ModifierProtected{
    protected String name="Arman";
    protected void display()
    {
        System.out.println("Hello "+name);
    }
}

class ModifierProtectedChild extends ModifierProtected
{

}

class TestProtected{

}
 class ProtectedTest {
    public static void main(String[] args) {
        ModifierProtectedChild modifierProtectedChild=new ModifierProtectedChild();
        System.out.println(modifierProtectedChild.name);
        modifierProtectedChild.display();
    }
}