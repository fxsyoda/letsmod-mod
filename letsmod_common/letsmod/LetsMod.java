package letsmod;

import letsmod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsMod
{
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        //Register Blocks/Items Here
    }
    
    @Init
    public void init(FMLInitializationEvent  event)
    {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        // A Comment
    }
    
    
    
}
