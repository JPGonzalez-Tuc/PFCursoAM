package com.curso.android.app.practica.pfcursoam


import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class MainActivityTest {

    @get: Rule
    var rule:ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun mainActivity_distintos() {

        // Testeo si al iniciar la aplicacion y clickear el boton
        // los textos son distintos. Deberia serlo ya que
        // al iniciarse la app los cuadros de textos difieren en su contenido
        // ("Escriba texto 1" y "Escriba texto 2")

        Espresso.onView(
            ViewMatchers.withId(R.id.button)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.textView)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Los textos son distintos")
            )
        )
    }

}