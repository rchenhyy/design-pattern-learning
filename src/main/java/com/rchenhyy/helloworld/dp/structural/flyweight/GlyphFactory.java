package com.rchenhyy.helloworld.dp.structural.flyweight;

/**
 * 图元工厂类
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/11/2
 */
public class GlyphFactory {

    private static final int NUM_OF_CHAR_CODES = 128;

    // flyweight objects
    private final Character[] characters;

    public GlyphFactory() {
        characters = new Character[NUM_OF_CHAR_CODES];
    }

    public Character createCharacter(int charCode) {
        // TO.DO. range check
        if (characters[charCode] == null) {
            return characters[charCode] = new Character(charCode);
        }
        return characters[charCode];
    }

    public Row createRow() {
        return new Row();
    }

    public Column createColumn() {
        return new Column();
    }
}