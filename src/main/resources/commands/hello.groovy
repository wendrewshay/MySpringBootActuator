package commands
import org.crsh.cli.Command
import org.crsh.cli.Usage
import org.crsh.command.InvocationContext


//命令定制，SSH连接后输入hello便可得到结果
class hello {
	
	@Usage("Say Hello") //注解解释该命令的用途
	@Command //注解当前是一个CRaSH命令
	def main(InvocationContext context) {
		
		def bootVersion = context.attributes['spring.boot.version']
		def springVersion = context.attributes['spring.version']
		
		return "Hello, your Spring Boot Version is "  + bootVersion + ", your Spring version is " + springVersion
	}
}