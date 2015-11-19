package gui.view;

import javax.swing.SpringLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import gui.controller.HipGUI;
import java.awt.Color;
import hip.model.Book;
import javax.swing.JComboBox;

/**
 * Holds the layout and widgets for the project.
 * 
 * @author ethr5627
 *
 */
public class HipPanel extends JPanel 
{
	private HipGUI hipGUI;
	private SpringLayout baseLayout;
	private JComboBox<String> phraseComboBox;
	private JLabel bookPageCountLabel;
	private JLabel bookAuthorLabel;
	private JLabel bookSubjectLabel;
	private JLabel bookTitleLabel;
	private JLabel bookPriceLabel;
	private JButton changeBookButton;
	private int maxClicks;
	private int startClick;

	public HipPanel(HipGUI hipGUI) 
	{
		this.hipGUI = hipGUI;
		baseLayout = new SpringLayout();
		bookPageCountLabel = new JLabel("The page count");
		bookAuthorLabel = new JLabel("The Author");
		bookSubjectLabel = new JLabel("The Subject");
		bookTitleLabel = new JLabel("The Title");
		bookPriceLabel = new JLabel("The Price");
		changeBookButton = new JButton("Change Books");
		phraseComboBox = new JComboBox<String>();
		maxClicks = hipGUI.getFirstHipster().getHipsterBooks().length;
		startClick = 0;
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupComboBox() 
	{
		String[] phrases = hipGUI.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}

	private void setupPanel() 
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.add(phraseComboBox);
		this.add(bookPageCountLabel);
		this.add(bookAuthorLabel);
		this.add(bookSubjectLabel);
		this.add(bookTitleLabel);
		this.add(bookPriceLabel);
		this.add(changeBookButton);

	}

	private void setupLayout() 
	{
		baseLayout.putConstraint(SpringLayout.NORTH, changeBookButton, -5, SpringLayout.NORTH, bookPriceLabel);
		baseLayout.putConstraint(SpringLayout.EAST, changeBookButton, -17, SpringLayout.WEST, bookPriceLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookSubjectLabel, 6,
				SpringLayout.SOUTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookSubjectLabel, -134,
				SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 0,
				SpringLayout.WEST, bookSubjectLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 20,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 161,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, bookPageCountLabel, -7,
				SpringLayout.NORTH, bookAuthorLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 0,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 6,
				SpringLayout.SOUTH, bookTitleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 0,
				SpringLayout.WEST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, bookTitleLabel, 2,
				SpringLayout.SOUTH, bookSubjectLabel);
		baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0,
				SpringLayout.WEST, bookPageCountLabel);
		baseLayout.putConstraint(SpringLayout.EAST, bookPageCountLabel, -110,
				SpringLayout.EAST, this);
	}

	private void setupListeners() 
	{
		phraseComboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent selection) 
			{
				int red = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem()
						.toString();
				hipGUI.getHipFrame().setTitle(updatedTitle);
			}
		});
		changeBookButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click) 
			{
				
				Book[] hipBooks = hipGUI.getFirstHipster().getHipsterBooks();
				if (startClick < maxClicks) 
				{
					bookPageCountLabel.setText("Book Pages: "
							+ hipBooks[startClick].getPageCount());
					bookAuthorLabel.setText("Book Author: "
							+ hipBooks[startClick].getAuthor());
					bookSubjectLabel.setText("Book Subject: "
							+ hipBooks[startClick].getSubject());
					bookTitleLabel.setText("Book Title: "
							+ hipBooks[startClick].getTitle());
					bookPriceLabel.setText("Book Price: "
							+ hipBooks[startClick].getPrice());
					startClick++;
				} 
				else 
				{
					startClick = 0;
					bookPageCountLabel.setText("Book Pages: ");
					bookAuthorLabel.setText("Book Author: ");
					bookSubjectLabel.setText("Book Subject: ");
					bookTitleLabel.setText("Book Title: ");
					bookPriceLabel.setText("Book Price: ");

				}
			}
		});
	}
}
