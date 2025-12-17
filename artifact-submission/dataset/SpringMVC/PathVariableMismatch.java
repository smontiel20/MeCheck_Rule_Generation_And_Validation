public class PathVariableMismatch {
    @RequestMapping("/path/{myVariable}/")
    public String mismatch(@PathVariable String name_is_not_equal_to_myVariable) {
        return "...";
    }

    @RequestMapping("/path/{myVariable}/")
    public String noMismatch(@PathVariable String myVariable) {
        return "...";
    }
}