package valmx.nelly.studienfahrtapp.containers;

public class Announcement {

    private final String title;
    private final String text;

    /**
     * @class
     * Die klasse wird ausschließlich genutzt, um den Inhalt und den Titel
     * einer Ankündigung auf der Hauptseite anzuzeigen
     *
     * @param text Text der angezeigt werden soll
     * @param title Titel oder header der Nachricht
     */

    public Announcement(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
