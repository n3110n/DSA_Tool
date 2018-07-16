package nika.dsa;

import java.io.File;

public class ScrollTreeNode {

    private File file;

    public ScrollTreeNode(File file) {

        this.file = file;
    }

    @Override
    public String toString() {
        String name = file.getName();
        if (name.equals("")) {
            return file.getAbsolutePath();
        } else {
                return name;
        }
    }
}
