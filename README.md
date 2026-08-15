# WitchStory / Witchery 1.7.10 - Decompiled & Mapped Sources

This branch contains a **full decompilation** of the Witchery 0.24.1 classes that were previously dumped as `.class` files, plus MCP `stable_12` mappings applied.

## What was done

1. Extracted all 1256 `.class` files from the original dump.
2. Decompiled them with **CFR 0.152**.
3. Applied **MCP stable_12** mappings for Minecraft 1.7.10 (SRG → MCP names).
4. Original package restored: `com.emoniph.witchery`.

## Important notes

- This is **decompiled code**, not original source. Expect some messy control flow, synthetic methods, and residual issues.
- The original mod is by **Emoniph**. Respect the original license / credits.
- Many inner classes appear as `Outer$Inner.java`.
- Assets and `mcmod.info` from the original dump should still be used.
- A clean ForgeGradle 1.2 project with `mappings = "stable_12"` is recommended.

## Build

Use a standard 1.7.10 ForgeGradle setup:

```gradle
minecraft {
    version = "1.7.10-10.13.4.1614-1.7.10"
    mappings = "stable_12"
    runDir = "eclipse"
}
```

Place the `com/emoniph/witchery` sources under `src/main/java`.

## Status

- Decompilation: 1256 / 1256 classes
- Mappings applied: yes (stable_12)
- First compile: not fully completed in the automated environment due to large file count; expected to need minor fixes for a successful build.

Credits: Original Witchery by Emoniph. Decompilation & mapping work performed via automated tools.
