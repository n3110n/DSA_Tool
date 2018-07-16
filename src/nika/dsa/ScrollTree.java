package nika.dsa;

import nika.dsa.CreateChildNodes;
import nika.dsa.ScrollTreeNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.File;

public class ScrollTree extends JPanel implements Runnable {

    private DefaultMutableTreeNode root;

    private DefaultTreeModel treeModel;

    private JTree tree;

    @Override
    public void run() {
        //JFrame frame = new JFrame("File Browser");

        File fileRoot = new File("C:/");
        root = new DefaultMutableTreeNode(new ScrollTreeNode(fileRoot));
        treeModel = new DefaultTreeModel(root);

        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        JScrollPane scrollPane = new JScrollPane(tree);

        this.add(scrollPane);
        this.setSize(640, 480);
        this.setVisible(true);

        CreateChildNodes ccn =
                new CreateChildNodes(fileRoot, root);
        new Thread(ccn).start();
    }
}
