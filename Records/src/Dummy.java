public record Dummy(int x, int y) {
    public Dummy {
        if(x > y) {
            x += 10;
        }
    }
}
