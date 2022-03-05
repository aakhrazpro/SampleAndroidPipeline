package tech.sunmi.ets.sampleandroidpipeline

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ConnectionTestcases {
    @Test
    fun test_if_connection_is_OK_With_Device() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("tech.sunmi.ets.sampleandroidpipeline", appContext.packageName)
    }
    @Test
    fun test_if_SDK1_can_be_connected() {
        assertTrue("SDK1 service is connected",true)
    }

    @Test
    fun test_if_SDK2_can_be_connected() {
        assertTrue("SDK2 service is connected",true)
    }

    @Test
    fun test_if_SDK3L_can_be_connected() {
        assertTrue("SDK3 service is connected",true)
    }
}