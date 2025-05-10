JAVAC=javac
JAVA=java
TEST=Test
TEMPLATE_DIR=../template

.PHONY: setup
setup:
	@if [ -z "$(n)" ]; then \
		echo "Error: Specify file name to create"; \
	elif [ ! -e "$(n).java" ]; then \
		cp $(TEMPLATE_DIR)/Solution.java ./$(n).java; \
		echo "Created file $(n).java"; \
	else \
		echo "Error: File $(n).java already exists"; \
	fi

.PHONY: test run clean
test:
	@$(MAKE) run n=$(n)

run:
	@if [ -z "$(n)" ]; then \
		echo "Error: Specify file name (e.g. make test n=0.0)"; \
	elif [ -e "$(n).java" ]; then \
		echo "Running tests for $(n)"; \
		$(JAVAC) $(n).java; \
		$(JAVA) -ea $(TEST); \
		$(MAKE) clean; \
	else \
		echo "Error: File $(n).java not exists"; \
	fi

clean:
	@rm -f *.class