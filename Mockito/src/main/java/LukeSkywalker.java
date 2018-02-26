import java.util.ArrayList;
import java.util.List;

public class LukeSkywalker {
    private final Robot robot;

    public LukeSkywalker(Robot robot) {
        this.robot = robot;
    }

    public List<String> askRobotAbout(String theme) {
        List<String> memories = robot.getMemories();
        List<String> filtered = new ArrayList<>(memories);
        filtered.removeIf(s -> s.contains(theme));
        return filtered;
    }

    public void makeRobotForget(String theme) {
        robot.removeMemoriesAbout(theme);
    }
}
