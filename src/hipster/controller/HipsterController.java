package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.SlothFrame;

public class HipsterController
{
	private SlothFrame appFrame;
	private Hipster selfHipster;
	private Hipster[] classHipsters;
	public Hipster[] getClassHipsters()
	{
		return classHipsters;
	}

	public void setClassHipsters(Hipster[] classHipsters)
	{
		this.classHipsters = classHipsters;
	}
	private int hipsterCount;

	public HipsterController()
	{
		selfHipster = new Hipster();
		classHipsters = new Hipster[50];
		hipsterCount = 0;
	}

	public Hipster getSelfHipster()
	{
		return selfHipster;

	}
/**
 * Replacing the current Hipster.
 * @param selfHipster The new Hipster to set.
 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}
/**
 * used to start the application GUI for the Hipster program.
 */
	public void start()
	
	{
		appFrame = new SlothFrame(this);
	}
/**
 * Retrieves the Hipster from the specified position in the array.
 * @param position
 * @return
 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		if (position < classHipsters.length && position >= 0)
		{
			currentHipster = classHipsters[position];
			return currentHipster;

		}
		return currentHipster;
	}
/**
 * used to retrieve a random Hipster object from the array of class Hipsters.
 * @return
 */
	public Hipster getRandomHipster()
	

	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * classHipsters.length);
		currentHipster = classHipsters[randomIndex];

		return selfHipster;

	}
/**
 * Creates and adds a Hipster to the array of class HIpsters from the specified values.
 * @param books The array of books for the current Hipster.
 * @param name The name of the current Hipster.
 * @param type The type of the current Hipster.
 * @param phrase This hipster's current phrase of hipsterness.
 */
	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < classHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			classHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame,
					"The class is full you are too mainstream to be added");
		}
	}
}