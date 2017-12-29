package net.exceeder.tutorial;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.MOD_ID , name = Tutorial.MOD_NAME , version = Tutorial.VERSION , dependencies = Tutorial.DEPENDENCIES)
public class Tutorial {
	//These below are constants
		public static final String MOD_ID = "tutorial";
		public static final String MOD_NAME = "My first tutorial";
		public static final String VERSION = "@VERSION";
		public static final String DEPENDENCIES = "required-after:forge@[14.23.1.2555,)";
		public static final String RESOURSE_PREFIX =  MOD_ID.toLowerCase();
	//These below are variables
		public static Random random = new Random();
	@Instance(MOD_ID)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = "net.exceeder.tutorial.ClientProxy" , serverSide = "net.exceeder.tutorial.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
		proxy.Init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		proxy.postInit(event);
	}
}








