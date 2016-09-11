package Fall_2015.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 * Using an Anonymous Inner Class for Event Handling
 */
public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> jComboBox;  // holds icon names
    private final JLabel label;     // displays selected icon
    private final JCheckBox jCheckBox;
    private final JCheckBox jCheckBox2;
    private final JCheckBox jCheckBox3;
    private final JRadioButton jRadioButton;
    private final JRadioButton jRadioButton2;

    private final static String[] names = {"engine.png", "engine2.png", "engine3.png"};
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2]))};

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        jCheckBox = new JCheckBox("CheckBox");
        jCheckBox2 = new JCheckBox("CheckBox2");
        jCheckBox3 = new JCheckBox("CheckBox3");

        jRadioButton = new JRadioButton("RadioButton01");
        jRadioButton2 = new JRadioButton("RadioButton02");

        jComboBox = new JComboBox<String>(names);
        jComboBox.setMaximumRowCount(3);
        jComboBox.setSelectedIndex(0);

        jComboBox.addItemListener(
                new ItemListener() {    // anonymous inner class
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED)
                            label.setIcon(icons[jComboBox.getSelectedIndex()]);
                    }
                }
        );

        jCheckBox.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jCheckBox.isSelected())jCheckBox.setText("worked");
                        else jCheckBox.setText("CheckBox");
                    }
                }
        );

        jCheckBox2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jCheckBox2.isSelected()) jCheckBox2.setText("worked");
                        else jCheckBox2.setText("CheckBox2");
                    }
                }
        );

        jCheckBox3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jCheckBox3.isSelected()) jCheckBox3.setText("worked");
                        else jCheckBox3.setText("CheckBox3");
                    }
                }
        );

        jRadioButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jRadioButton.isSelected()) jRadioButton.setText("selected");
                        else jRadioButton.setText("RadioButton01");
                    }
                }
        );

        jRadioButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (jRadioButton2.isSelected()) jRadioButton2.setText("selected");
                        else jRadioButton2.setText("RadioButton02");
                    }
                }
        );

        add(jComboBox);
        label = new JLabel(icons[0]);
        add(label);
        add(jCheckBox);
        add(jCheckBox2);
        add(jCheckBox3);
        add(jRadioButton);
        add(jRadioButton2);
    }
}
