package com.facebook.react.defaults;

import android.app.Application;
import com.facebook.react.O;
import com.facebook.react.V;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManagerProviderImpl;
import com.facebook.react.uimanager.J0;
import com.facebook.react.uimanager.K0;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends O {

    public static final class a implements K0 {
        a() {
        }

        @Override // com.facebook.react.uimanager.K0
        public Collection a() {
            return d.this.c().J();
        }

        @Override // com.facebook.react.uimanager.K0
        public ViewManager b(String viewManagerName) {
            Intrinsics.checkNotNullParameter(viewManagerName, "viewManagerName");
            return d.this.c().A(viewManagerName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected d(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UIManager i(d dVar, ReactApplicationContext reactApplicationContext) {
        J0 j10;
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        ComponentFactory componentFactory = new ComponentFactory();
        DefaultComponentsRegistry.register(componentFactory);
        if (dVar.b()) {
            j10 = new J0(dVar.new a());
        } else {
            List listI = dVar.c().I(reactApplicationContext);
            Intrinsics.checkNotNullExpressionValue(listI, "getOrCreateViewManagers(...)");
            j10 = new J0(listI);
        }
        return new FabricUIManagerProviderImpl(componentFactory, j10).createUIManager(reactApplicationContext);
    }

    @Override // com.facebook.react.O
    protected V.a getReactPackageTurboModuleManagerDelegateBuilder() {
        if (j()) {
            return new DefaultTurboModuleManagerDelegate.a();
        }
        return null;
    }

    @Override // com.facebook.react.O
    protected UIManagerProvider getUIManagerProvider() {
        if (j()) {
            return new c(this);
        }
        return null;
    }

    protected boolean j() {
        return false;
    }
}
