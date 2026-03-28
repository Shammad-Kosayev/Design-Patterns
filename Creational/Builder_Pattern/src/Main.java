public class Main {
    public static void main(String[] args) {
        Entity build = Entity.builder()
                .username("ForeverOyuncu2")
                .email("foreveroyuncu2@gmail.com")
                .address("Planet earth")
                .age(18)
                .admin(true)
                .build();

        System.out.println("Object has been created!: " + build);

    }
}