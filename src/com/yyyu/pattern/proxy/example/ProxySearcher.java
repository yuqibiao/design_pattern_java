package com.yyyu.pattern.proxy.example;

/**
 * searcher业务的代理
 */
public class ProxySearcher implements Searcher{

    private Searcher mSearcher;
    private ValidateUser mValidate;
    private InfoLogger mLogger;

    public ProxySearcher(Searcher searcher , ValidateUser validate , InfoLogger logger){
        this.mSearcher = searcher;
        this.mValidate = validate;
        this.mLogger = logger;
    }

    @Override
    public void doSearcher(int userId, String keyword) {
        boolean legal = mValidate.validate(userId);
        if (legal){
            mSearcher.doSearcher(userId , keyword);
            mLogger.writeLog(keyword);
        }else{

        }
    }
}
