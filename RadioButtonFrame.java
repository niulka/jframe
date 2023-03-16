import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame;
{
    private JTextField textfield;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font boldItalicFont;
    private JRadioButton plainJRadioButton;
    private JRadioButton boldJRadioButton;
    private JRadioButton italicJRadioButton;
    private JRadioButton boldItalicJRadioButton;
    private ButtonGroup radioGroup;
    
    public RadioButtonFrame()
    {
        super("RadioButton Test");
        setLayout( new FlowLayout());
        textfield = new JTextField("watch the font style change",25);
        add(textfield);
        
        plainJRadioButton = new JRadioButton("plain",true);
        boldJRadioButton = new JRadioButton("Bold",false);
        italicJRadioButton = new JRadioButton("italic", false);
        boldItalicJRadioButton= new JRadioButton("Bold/Italic",false);
        add(plainJRadioButton);
        add(boldJRadioButton);
        add(italicJRadioButton);
        add(boldItalicJRadioButton);
        add(boldItalicJRadioButton);
        
        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldItalicJRadioButton);
        
        
        plainFont = new Font("serif",Font.PLAIN,14);
        boldFont = new Font("serif",Font.BOLD,14);
        italicFont = new Font("serif",Font.ITALIC,14);
        boldItalicFont = new Font("serif",Font.BOLD + Font.ITALIC,14);
        textfield.setFont(plainFont);
        
        
        plainJRadioButton.addItemListener(
                new RadioButtonHandler(plainFont) );
              boldJRadioButton.addItemListener(
                new RadioButtonHandler(boldFont));
              italicJRadioButton.addItemListener(
                 new RadioButtonHandler(italicFont));
              boldItalicJRadioButton.addItemListener(
                 new RadioButtonHandler(boldItalicFont));
    }
    private Font font;
    
    public RadioButtonHandler(font f)
    {
        font = f;
    }
    
    public void itemStateChanged(ItemEvent event)
    {
        textfield.setFont(font);
    }
        
        
        
        
}

