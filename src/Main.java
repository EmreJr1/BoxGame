public class Main {

    public static void main(String[] args) {
        Fighter emre=new Fighter("Conor MCgregor",50,200,75,50);
        Fighter ahmet=new Fighter("Floyd",88,190,75,20);
        Ring r=new Ring(emre,ahmet,60,80);
        r.run();
    }
}
