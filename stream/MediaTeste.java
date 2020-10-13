public class MediaTeste {
    public static void main(String[] args) {
        var m1 = new Media().adiciona(7).adiciona(7.5).adiciona(8);
        var m2 = new Media().adiciona(8).adiciona(9).adiciona(7);

        System.out.println(m1.getMedia());
        System.out.println(m2.getMedia());
        System.out.println(Media.combinar(m1, m2).getMedia());
    }
}
