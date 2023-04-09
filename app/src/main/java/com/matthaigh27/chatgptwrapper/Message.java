package com.matthaigh27.chatgptwrapper;

public class Message {
    private String mText;
    private boolean mIsSentByUser;
    public Message(String text, boolean isSentByUser) {
        mText = text;
        mIsSentByUser = isSentByUser;
    }
    public String getText() {
        return mText;
    }
    public boolean isSentByUser() {
        return mIsSentByUser;
    }
}
