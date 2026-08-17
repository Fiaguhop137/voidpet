package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import com.applovin.ui.AxonEventsListActivity;
import p184k4.C3892a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f28224a;

    @Override // com.applovin.impl.o0
    public final p a() {
        p0 p0Var = this.f28224a;
        if (p0Var != null) {
            return p0Var.f28284e;
        }
        return null;
    }

    public final void a(b bVar, h1 h1Var, l1 l1Var) {
        if (h1Var.f28053a == 1) {
            bVar.f27935a.add(new c(new m0(this), bVar));
            startActivity(new Intent(this, (Class<?>) AxonEventsListActivity.class));
        }
    }

    public final void a(p0 p0Var, b bVar) {
        this.f28224a = p0Var;
        p0Var.f28228d = new C3892a0(this, bVar);
    }

    @Override // com.applovin.impl.o0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Debugger");
        setContentView(R.layout.debugger_list_view);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f28224a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p0 p0Var = this.f28224a;
        if (p0Var != null) {
            p0Var.f28228d = null;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        p0 p0Var = this.f28224a;
        if (p0Var != null) {
            p0Var.notifyDataSetChanged();
        }
    }
}
