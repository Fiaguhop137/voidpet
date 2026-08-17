package com.facebook.react;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: renamed from: com.facebook.react.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractActivityC2237q extends androidx.appcompat.app.c implements M6.a, M6.f {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final p054d.v f30060E = new a(true);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final C2240u f30059D = C0();

    /* JADX INFO: renamed from: com.facebook.react.q$a */
    class a extends p054d.v {
        a(boolean z10) {
            super(z10);
        }

        @Override // p054d.v
        public void d() {
            j(false);
            AbstractActivityC2237q.this.onBackPressed();
            j(true);
        }
    }

    protected AbstractActivityC2237q() {
    }

    protected abstract C2240u C0();

    public C2298y D0() {
        return this.f30059D.getReactDelegate();
    }

    @Override // M6.f
    public void a(String[] strArr, int i10, M6.g gVar) {
        this.f30059D.requestPermissions(strArr, i10, gVar);
    }

    @Override // M6.a
    public void b() {
        this.f30060E.j(false);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.j, p054d.j, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f30059D.onActivityResult(i10, i11, intent);
    }

    @Override // p054d.j, android.app.Activity
    public void onBackPressed() {
        if (this.f30059D.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.c, p054d.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f30059D.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.j, p054d.j, Y0.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30059D.onCreate(bundle);
        if (p116g7.a.a(this)) {
            p().h(this, this.f30060E);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f30059D.onDestroy();
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f30059D.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return this.f30059D.onKeyLongPress(i10, keyEvent) || super.onKeyLongPress(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return this.f30059D.onKeyUp(i10, keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @Override // p054d.j, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f30059D.onNewIntent(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f30059D.onPause();
    }

    @Override // androidx.fragment.app.j, p054d.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f30059D.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f30059D.onResume();
    }

    @Override // p054d.j, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f30059D.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f30059D.onWindowFocusChanged(z10);
    }
}
