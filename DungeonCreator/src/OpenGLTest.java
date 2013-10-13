import java.awt.Canvas;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


public class OpenGLTest extends Canvas{
	
	public OpenGLTest(){
		try{
			Display.setDisplayMode(new DisplayMode(1920, 1080));
			Display.setTitle("");
			Display.setParent(this);
			Display.create();
		}catch (LWJGLException e){
			e.printStackTrace();
		}
		
		while(!Display.isCloseRequested()){
			Display.update();
			Display.sync(60);
			
		}
		Display.destroy();
		
	}
	
	public static void main(String[] args){
		new OpenGLTest();
		System.out.println("TEST");
		System.out.println("TEST2");
	}
}
