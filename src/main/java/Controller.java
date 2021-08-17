public class Controller {
    private DiaPhuongService diaPhuongService;

    public Controller(DiaPhuongService diaPhuongService) {
        this.diaPhuongService = diaPhuongService;
    }

    public void search(String name) {
        diaPhuongService.search(name);
    }

    public void chose(String id) {
        diaPhuongService.chose(id);
    }

    public String toString() {
        return diaPhuongService.toString();
    }

}
