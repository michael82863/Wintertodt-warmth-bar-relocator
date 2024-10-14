package com.wintertodtwarmthbarrelocator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class WintertodtWarmthBarRelocatorTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(WintertodtWarmthBarRelocatorPlugin.class);
		RuneLite.main(args);
	}
}