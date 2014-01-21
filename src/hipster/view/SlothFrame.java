package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;
/**
 * 
 * @author jwah4895
 *
 */
public class SlothFrame extends JFrame
{
	/**
	 * Creates a controller.
	 */
	private HipsterController baseController;
	
	/**
	 * Creates a panel.
	 */
	
	private HipsterPanel basePanel;
/**
 * This creates the frame, and declares it.
 * @param baseController
 */
	public SlothFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);

		setupFrame();
	}
/**
 * Creates a window.
 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(700, 450);
		this.setVisible(true);
	}
}
