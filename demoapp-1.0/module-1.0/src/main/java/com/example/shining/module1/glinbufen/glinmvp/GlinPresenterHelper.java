package com.example.shining.module1.glinbufen.glinmvp;

/**
 * GlinPresenter Helper
 */
public class GlinPresenterHelper {
    /**
     * presenter创建帮助类
     * @param klass presenter class
     * @param view View
     * @param <T> T of View
     * @param <P> P of Presenter
     * @return presenter
     */
    public static <T extends GlinIView, P extends GlinPresenter> P create(Class<P> klass, T view) {
        try {
            P presenter = klass.newInstance();
            presenter.onCreate(view);

            return presenter;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
