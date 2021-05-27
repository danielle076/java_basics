## Codeblock

    int score = 5000;

If you don't use `{}` and you have 2 `System.out.println` lines then he takes them both at true, if it's not true then he only takes the second one because Java doesn't know what to compare to. A `{}` will do that even if you only have 1 line, always use the code block `{}`.

    if (score == 5000) {
        System.out.println("Your score was 5000");
        System.out.println("This was executed");
    }
