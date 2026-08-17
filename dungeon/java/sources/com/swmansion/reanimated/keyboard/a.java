package com.swmansion.reanimated.keyboard;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements NotifyAboutKeyboardChangeFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyboardAnimationManager f38929a;

    public /* synthetic */ a(KeyboardAnimationManager keyboardAnimationManager) {
        this.f38929a = keyboardAnimationManager;
    }

    @Override // com.swmansion.reanimated.keyboard.NotifyAboutKeyboardChangeFunction
    public final void call() {
        this.f38929a.notifyAboutKeyboardChange();
    }
}
