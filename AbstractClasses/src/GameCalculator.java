public abstract class GameCalculator {
    public abstract void hesapla();
    //Abstract olan methodda kim inherit ediyorsa kendi methodunu yazmak zorundadir.
    // Method ana classta yazılır, her inherit eden class kendi kuralina gore methodu tekrar yazar.

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
