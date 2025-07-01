//Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(),
// stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
package BeyondJava8Features1;
public class Question5 {
    public static void main(String[] args) {
        String name = "Prince".repeat(4);
        // Prince will print 4 times
        System.out.println(name);
        // strip() and trim()
        String spaced = "  \t\t Welcome \u2000 ";
        // strip() (removes all whitespace)
        System.out.println("." + spaced.strip() + ".");
        // trim()(removes only space/tab)
        System.out.println("." + spaced.trim() + ".");

        // isBlank
        System.out.println("   ".isBlank()); // true

        // indent
        String text = "Hello\nWorld";
        System.out.println(text.indent(4)); // Adds 4 spaces

        // transform
        String result = "Prince".transform(s -> s + " Rana")
                .transform(String::toUpperCase);
        System.out.println(result);

        // stripIndent
        String block = """
                Hello
                  World""";
        System.out.println(block.stripIndent());
        // translateEscapes
        String escapes = "Hello\\tWorld\\n";
        System.out.println(escapes.translateEscapes());

        // tripleQuotes
        String html = """
                <html>
                    <body>
                        <p>Hello Everyone</p>
                    </body>
                </html>""";
        System.out.println(html);

        // formatted
        String formatted = "Hello %s %d".formatted("Java",8);
        System.out.println(formatted);
    }
}
