import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://graph.facebook.com/v16.0/130981449897087/messages"))
                    .header("Authorization",
                            "Bearer EAACOxsvJOkQBAE6DfuU3HWEOU5Dp3ksMTQzJZAXcFc4mKZAcEeQqlADAp3dSfFYPfj8PZBEQYzy71E2VeGtsGLBcxhs3rQ7drX8TvJoxn2sD0oXUvcYL3sGaoZBL3QSZCRXt8AklFfiZAHZCXI8J4T9r8dUcNGGim86HmLZBbyOylpEU6mvaDsZANhE7hQdVEsqt71FmhqEfqbwZDZD")
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(
                            "{ \"messaging_product\": \"whatsapp\", \"recipient_type\": \"individual\", \"to\": \"919025718669\", \"type\": \"template\", \"template\": { \"name\": \"hello_world\", \"language\": { \"code\": \"en_US\" } } }"))
                    .build();
            HttpClient http = HttpClient.newHttpClient();
            HttpResponse<String> response = http.send(request, BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (URISyntaxException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}