import java.io.File

fun main() {


    println("Ytsuken/File [1.1] ")
    println("Enter <filename>.<extension>")
    println()

    while (true) {

        val File = readln().trim()
        val Invalid = "\\/:*?\"<>|"


        if (File.isEmpty()) {
            println("File name cannot be empty")
            continue
        }

        if (File.any { it in Invalid }) {
            println("The file name contains prohibited characters")
            continue
        }


        val New = File(File)

        if (New.exists()) {
            println("The file already exists")
            continue
        }

        New.createNewFile()

    }
}
