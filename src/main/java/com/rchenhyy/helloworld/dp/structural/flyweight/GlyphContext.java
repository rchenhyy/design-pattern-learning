package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 图元上下文
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/2
 */
public interface GlyphContext {

    void next(int step);

    void insert(int quantity);

    Font getFont();

    void setFont(Font font, int span);

    // subclass may include these fields:
    // int index
    // BTree<Font> fonts
}
