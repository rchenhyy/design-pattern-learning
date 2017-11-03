package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 字符
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/3
 */
public class Character extends LeafGlyph {

    private int charCode;

    public Character(int charCode) {
        this.charCode = charCode;
    }

    @Override
    public void draw(Window window, GlyphContext context) {
        // draw a character
    }
}
