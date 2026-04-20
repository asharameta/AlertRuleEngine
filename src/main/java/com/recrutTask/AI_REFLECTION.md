1. **Which AI tools did you use** while working on this task? (e.g., ChatGPT, GitHub Copilot, Claude, none). If none, state that and skip questions 2-3.

   *Claude.*

2. **Describe one interaction with AI that helped you.** Paste the prompt you gave and a summary of the response. Explain what you took from it and why it was useful.

   *I asked about minimal abstraction interface for FizzBuzz type tasks, 
   it gave me this interface and an example. I took only the interface, changed the name and, based on it, implemented `AlertRule`*

```
Prompt: Give me minimal abstraction interface for FizzBuzz type tasks

public interface NumberRule {
    boolean matches(int n);
    String output();
}

```

3. **Describe one AI suggestion that you modified or rejected.** What did the AI suggest? Why didn't you use it as-is? What did you do instead?

   *From the same response, Claude also provided an example of its interface usage. I rejected it*

```
List<NumberRule> rules = List.of(
    new NumberRule() {
        public boolean matches(int n) { return n % 15 == 0; }
        public String output() { return "FizzBuzz"; }
    },
    new NumberRule() {
        public boolean matches(int n) { return n % 3 == 0; }
        public String output() { return "Fizz"; }
    },
    new NumberRule() {
        public boolean matches(int n) { return n % 5 == 0; }
        public String output() { return "Buzz"; }
    }
);

for (int i = 1; i <= 100; i++) {
    String result = rules.stream()
        .filter(r -> r.matches(i))
        .findFirst()
        .map(NumberRule::output)
        .orElse(String.valueOf(i));
    System.out.println(result);
}
```

*In my opinion Claude's solution is a bit hard to read and could be easily shortened and improved.*

P.S. I'm not really a fan of LeetCode type tasks but this one was manageable :P